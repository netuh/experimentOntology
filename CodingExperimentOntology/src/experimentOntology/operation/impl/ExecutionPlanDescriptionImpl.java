/**
 */
package experimentOntology.operation.impl;

import experimentOntology.operation.ExecutionPlan;
import experimentOntology.operation.ExecutionPlanDescription;
import experimentOntology.operation.OperationPackage;
import experimentOntology.operation.PreExecutionPlan;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Plan Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.operation.impl.ExecutionPlanDescriptionImpl#getPlan <em>Plan</em>}</li>
 *   <li>{@link experimentOntology.operation.impl.ExecutionPlanDescriptionImpl#getPrePlan <em>Pre Plan</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecutionPlanDescriptionImpl extends MinimalEObjectImpl.Container implements ExecutionPlanDescription {
	/**
	 * The cached value of the '{@link #getPlan() <em>Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlan()
	 * @generated
	 * @ordered
	 */
	protected ExecutionPlan plan;

	/**
	 * The cached value of the '{@link #getPrePlan() <em>Pre Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrePlan()
	 * @generated
	 * @ordered
	 */
	protected PreExecutionPlan prePlan;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionPlanDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationPackage.Literals.EXECUTION_PLAN_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionPlan getPlan() {
		return plan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlan(ExecutionPlan newPlan, NotificationChain msgs) {
		ExecutionPlan oldPlan = plan;
		plan = newPlan;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OperationPackage.EXECUTION_PLAN_DESCRIPTION__PLAN, oldPlan, newPlan);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlan(ExecutionPlan newPlan) {
		if (newPlan != plan) {
			NotificationChain msgs = null;
			if (plan != null)
				msgs = ((InternalEObject)plan).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OperationPackage.EXECUTION_PLAN_DESCRIPTION__PLAN, null, msgs);
			if (newPlan != null)
				msgs = ((InternalEObject)newPlan).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OperationPackage.EXECUTION_PLAN_DESCRIPTION__PLAN, null, msgs);
			msgs = basicSetPlan(newPlan, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationPackage.EXECUTION_PLAN_DESCRIPTION__PLAN, newPlan, newPlan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreExecutionPlan getPrePlan() {
		return prePlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrePlan(PreExecutionPlan newPrePlan, NotificationChain msgs) {
		PreExecutionPlan oldPrePlan = prePlan;
		prePlan = newPrePlan;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OperationPackage.EXECUTION_PLAN_DESCRIPTION__PRE_PLAN, oldPrePlan, newPrePlan);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrePlan(PreExecutionPlan newPrePlan) {
		if (newPrePlan != prePlan) {
			NotificationChain msgs = null;
			if (prePlan != null)
				msgs = ((InternalEObject)prePlan).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OperationPackage.EXECUTION_PLAN_DESCRIPTION__PRE_PLAN, null, msgs);
			if (newPrePlan != null)
				msgs = ((InternalEObject)newPrePlan).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OperationPackage.EXECUTION_PLAN_DESCRIPTION__PRE_PLAN, null, msgs);
			msgs = basicSetPrePlan(newPrePlan, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationPackage.EXECUTION_PLAN_DESCRIPTION__PRE_PLAN, newPrePlan, newPrePlan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OperationPackage.EXECUTION_PLAN_DESCRIPTION__PLAN:
				return basicSetPlan(null, msgs);
			case OperationPackage.EXECUTION_PLAN_DESCRIPTION__PRE_PLAN:
				return basicSetPrePlan(null, msgs);
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
			case OperationPackage.EXECUTION_PLAN_DESCRIPTION__PLAN:
				return getPlan();
			case OperationPackage.EXECUTION_PLAN_DESCRIPTION__PRE_PLAN:
				return getPrePlan();
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
			case OperationPackage.EXECUTION_PLAN_DESCRIPTION__PLAN:
				setPlan((ExecutionPlan)newValue);
				return;
			case OperationPackage.EXECUTION_PLAN_DESCRIPTION__PRE_PLAN:
				setPrePlan((PreExecutionPlan)newValue);
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
			case OperationPackage.EXECUTION_PLAN_DESCRIPTION__PLAN:
				setPlan((ExecutionPlan)null);
				return;
			case OperationPackage.EXECUTION_PLAN_DESCRIPTION__PRE_PLAN:
				setPrePlan((PreExecutionPlan)null);
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
			case OperationPackage.EXECUTION_PLAN_DESCRIPTION__PLAN:
				return plan != null;
			case OperationPackage.EXECUTION_PLAN_DESCRIPTION__PRE_PLAN:
				return prePlan != null;
		}
		return super.eIsSet(featureID);
	}

} //ExecutionPlanDescriptionImpl
