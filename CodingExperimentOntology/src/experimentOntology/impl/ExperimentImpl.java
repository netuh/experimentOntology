/**
 */
package experimentOntology.impl;

import experimentOntology.Experiment;
import experimentOntology.ExperimentOntologyPackage;

import experimentOntology.operation.ExecutionPlanDescription;

import experimentOntology.planning.ExperimentalPlanDescription;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Experiment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.impl.ExperimentImpl#getPlan <em>Plan</em>}</li>
 *   <li>{@link experimentOntology.impl.ExperimentImpl#getExecutionPlan <em>Execution Plan</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExperimentImpl extends MinimalEObjectImpl.Container implements Experiment {
	/**
	 * The cached value of the '{@link #getPlan() <em>Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlan()
	 * @generated
	 * @ordered
	 */
	protected ExperimentalPlanDescription plan;

	/**
	 * The cached value of the '{@link #getExecutionPlan() <em>Execution Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionPlan()
	 * @generated
	 * @ordered
	 */
	protected ExecutionPlanDescription executionPlan;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExperimentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExperimentOntologyPackage.Literals.EXPERIMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExperimentalPlanDescription getPlan() {
		return plan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlan(ExperimentalPlanDescription newPlan, NotificationChain msgs) {
		ExperimentalPlanDescription oldPlan = plan;
		plan = newPlan;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.EXPERIMENT__PLAN, oldPlan, newPlan);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlan(ExperimentalPlanDescription newPlan) {
		if (newPlan != plan) {
			NotificationChain msgs = null;
			if (plan != null)
				msgs = ((InternalEObject)plan).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExperimentOntologyPackage.EXPERIMENT__PLAN, null, msgs);
			if (newPlan != null)
				msgs = ((InternalEObject)newPlan).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExperimentOntologyPackage.EXPERIMENT__PLAN, null, msgs);
			msgs = basicSetPlan(newPlan, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.EXPERIMENT__PLAN, newPlan, newPlan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionPlanDescription getExecutionPlan() {
		return executionPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExecutionPlan(ExecutionPlanDescription newExecutionPlan, NotificationChain msgs) {
		ExecutionPlanDescription oldExecutionPlan = executionPlan;
		executionPlan = newExecutionPlan;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.EXPERIMENT__EXECUTION_PLAN, oldExecutionPlan, newExecutionPlan);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionPlan(ExecutionPlanDescription newExecutionPlan) {
		if (newExecutionPlan != executionPlan) {
			NotificationChain msgs = null;
			if (executionPlan != null)
				msgs = ((InternalEObject)executionPlan).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExperimentOntologyPackage.EXPERIMENT__EXECUTION_PLAN, null, msgs);
			if (newExecutionPlan != null)
				msgs = ((InternalEObject)newExecutionPlan).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExperimentOntologyPackage.EXPERIMENT__EXECUTION_PLAN, null, msgs);
			msgs = basicSetExecutionPlan(newExecutionPlan, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.EXPERIMENT__EXECUTION_PLAN, newExecutionPlan, newExecutionPlan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExperimentOntologyPackage.EXPERIMENT__PLAN:
				return basicSetPlan(null, msgs);
			case ExperimentOntologyPackage.EXPERIMENT__EXECUTION_PLAN:
				return basicSetExecutionPlan(null, msgs);
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
			case ExperimentOntologyPackage.EXPERIMENT__PLAN:
				return getPlan();
			case ExperimentOntologyPackage.EXPERIMENT__EXECUTION_PLAN:
				return getExecutionPlan();
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
			case ExperimentOntologyPackage.EXPERIMENT__PLAN:
				setPlan((ExperimentalPlanDescription)newValue);
				return;
			case ExperimentOntologyPackage.EXPERIMENT__EXECUTION_PLAN:
				setExecutionPlan((ExecutionPlanDescription)newValue);
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
			case ExperimentOntologyPackage.EXPERIMENT__PLAN:
				setPlan((ExperimentalPlanDescription)null);
				return;
			case ExperimentOntologyPackage.EXPERIMENT__EXECUTION_PLAN:
				setExecutionPlan((ExecutionPlanDescription)null);
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
			case ExperimentOntologyPackage.EXPERIMENT__PLAN:
				return plan != null;
			case ExperimentOntologyPackage.EXPERIMENT__EXECUTION_PLAN:
				return executionPlan != null;
		}
		return super.eIsSet(featureID);
	}

} //ExperimentImpl
