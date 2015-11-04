/**
 */
package experimentOntology.operation.impl;

import experimentOntology.operation.CommonExecutionPlan;
import experimentOntology.operation.ExecutionPlanByTreatment;
import experimentOntology.operation.OperationPackage;

import experimentOntology.planning.Treatment;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Plan By Treatment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.operation.impl.ExecutionPlanByTreatmentImpl#getTreatment <em>Treatment</em>}</li>
 *   <li>{@link experimentOntology.operation.impl.ExecutionPlanByTreatmentImpl#getPlan <em>Plan</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecutionPlanByTreatmentImpl extends MinimalEObjectImpl.Container implements ExecutionPlanByTreatment {
	/**
	 * The cached value of the '{@link #getTreatment() <em>Treatment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreatment()
	 * @generated
	 * @ordered
	 */
	protected Treatment treatment;

	/**
	 * The cached value of the '{@link #getPlan() <em>Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlan()
	 * @generated
	 * @ordered
	 */
	protected CommonExecutionPlan plan;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionPlanByTreatmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationPackage.Literals.EXECUTION_PLAN_BY_TREATMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Treatment getTreatment() {
		if (treatment != null && treatment.eIsProxy()) {
			InternalEObject oldTreatment = (InternalEObject)treatment;
			treatment = (Treatment)eResolveProxy(oldTreatment);
			if (treatment != oldTreatment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OperationPackage.EXECUTION_PLAN_BY_TREATMENT__TREATMENT, oldTreatment, treatment));
			}
		}
		return treatment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Treatment basicGetTreatment() {
		return treatment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTreatment(Treatment newTreatment) {
		Treatment oldTreatment = treatment;
		treatment = newTreatment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationPackage.EXECUTION_PLAN_BY_TREATMENT__TREATMENT, oldTreatment, treatment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonExecutionPlan getPlan() {
		return plan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlan(CommonExecutionPlan newPlan, NotificationChain msgs) {
		CommonExecutionPlan oldPlan = plan;
		plan = newPlan;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OperationPackage.EXECUTION_PLAN_BY_TREATMENT__PLAN, oldPlan, newPlan);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlan(CommonExecutionPlan newPlan) {
		if (newPlan != plan) {
			NotificationChain msgs = null;
			if (plan != null)
				msgs = ((InternalEObject)plan).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OperationPackage.EXECUTION_PLAN_BY_TREATMENT__PLAN, null, msgs);
			if (newPlan != null)
				msgs = ((InternalEObject)newPlan).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OperationPackage.EXECUTION_PLAN_BY_TREATMENT__PLAN, null, msgs);
			msgs = basicSetPlan(newPlan, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationPackage.EXECUTION_PLAN_BY_TREATMENT__PLAN, newPlan, newPlan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OperationPackage.EXECUTION_PLAN_BY_TREATMENT__PLAN:
				return basicSetPlan(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OperationPackage.EXECUTION_PLAN_BY_TREATMENT__TREATMENT:
				if (resolve) return getTreatment();
				return basicGetTreatment();
			case OperationPackage.EXECUTION_PLAN_BY_TREATMENT__PLAN:
				return getPlan();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OperationPackage.EXECUTION_PLAN_BY_TREATMENT__TREATMENT:
				setTreatment((Treatment)newValue);
				return;
			case OperationPackage.EXECUTION_PLAN_BY_TREATMENT__PLAN:
				setPlan((CommonExecutionPlan)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OperationPackage.EXECUTION_PLAN_BY_TREATMENT__TREATMENT:
				setTreatment((Treatment)null);
				return;
			case OperationPackage.EXECUTION_PLAN_BY_TREATMENT__PLAN:
				setPlan((CommonExecutionPlan)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OperationPackage.EXECUTION_PLAN_BY_TREATMENT__TREATMENT:
				return treatment != null;
			case OperationPackage.EXECUTION_PLAN_BY_TREATMENT__PLAN:
				return plan != null;
		}
		return super.eIsSet(featureID);
	}

} //ExecutionPlanByTreatmentImpl
