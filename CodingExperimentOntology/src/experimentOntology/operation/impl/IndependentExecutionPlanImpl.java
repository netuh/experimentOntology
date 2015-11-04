/**
 */
package experimentOntology.operation.impl;

import experimentOntology.operation.ExecutionPlanByTreatment;
import experimentOntology.operation.IndependentExecutionPlan;
import experimentOntology.operation.OperationPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Independent Execution Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.operation.impl.IndependentExecutionPlanImpl#getPlanByTreatment <em>Plan By Treatment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IndependentExecutionPlanImpl extends ExecutionPlanImpl implements IndependentExecutionPlan {
	/**
	 * The cached value of the '{@link #getPlanByTreatment() <em>Plan By Treatment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanByTreatment()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutionPlanByTreatment> planByTreatment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndependentExecutionPlanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationPackage.Literals.INDEPENDENT_EXECUTION_PLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutionPlanByTreatment> getPlanByTreatment() {
		if (planByTreatment == null) {
			planByTreatment = new EObjectContainmentEList<ExecutionPlanByTreatment>(ExecutionPlanByTreatment.class, this, OperationPackage.INDEPENDENT_EXECUTION_PLAN__PLAN_BY_TREATMENT);
		}
		return planByTreatment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OperationPackage.INDEPENDENT_EXECUTION_PLAN__PLAN_BY_TREATMENT:
				return ((InternalEList<?>)getPlanByTreatment()).basicRemove(otherEnd, msgs);
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
			case OperationPackage.INDEPENDENT_EXECUTION_PLAN__PLAN_BY_TREATMENT:
				return getPlanByTreatment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OperationPackage.INDEPENDENT_EXECUTION_PLAN__PLAN_BY_TREATMENT:
				getPlanByTreatment().clear();
				getPlanByTreatment().addAll((Collection<? extends ExecutionPlanByTreatment>)newValue);
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
			case OperationPackage.INDEPENDENT_EXECUTION_PLAN__PLAN_BY_TREATMENT:
				getPlanByTreatment().clear();
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
			case OperationPackage.INDEPENDENT_EXECUTION_PLAN__PLAN_BY_TREATMENT:
				return planByTreatment != null && !planByTreatment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IndependentExecutionPlanImpl
