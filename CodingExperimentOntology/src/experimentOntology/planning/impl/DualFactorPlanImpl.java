/**
 */
package experimentOntology.planning.impl;

import experimentOntology.planning.DualFactorPlan;
import experimentOntology.planning.Factor;
import experimentOntology.planning.PlanningPackage;

import experimentOntology.planning.designOfExperiment.TwoFactorDesign;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dual Factor Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.planning.impl.DualFactorPlanImpl#getFactor <em>Factor</em>}</li>
 *   <li>{@link experimentOntology.planning.impl.DualFactorPlanImpl#getDesign <em>Design</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DualFactorPlanImpl extends ExperimentalPlanImpl implements DualFactorPlan {
	/**
	 * The cached value of the '{@link #getFactor() <em>Factor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactor()
	 * @generated
	 * @ordered
	 */
	protected EList<Factor> factor;

	/**
	 * The cached value of the '{@link #getDesign() <em>Design</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesign()
	 * @generated
	 * @ordered
	 */
	protected TwoFactorDesign design;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DualFactorPlanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlanningPackage.Literals.DUAL_FACTOR_PLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Factor> getFactor() {
		if (factor == null) {
			factor = new EObjectContainmentEList<Factor>(Factor.class, this, PlanningPackage.DUAL_FACTOR_PLAN__FACTOR);
		}
		return factor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TwoFactorDesign getDesign() {
		return design;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDesign(TwoFactorDesign newDesign, NotificationChain msgs) {
		TwoFactorDesign oldDesign = design;
		design = newDesign;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanningPackage.DUAL_FACTOR_PLAN__DESIGN, oldDesign, newDesign);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesign(TwoFactorDesign newDesign) {
		if (newDesign != design) {
			NotificationChain msgs = null;
			if (design != null)
				msgs = ((InternalEObject)design).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanningPackage.DUAL_FACTOR_PLAN__DESIGN, null, msgs);
			if (newDesign != null)
				msgs = ((InternalEObject)newDesign).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanningPackage.DUAL_FACTOR_PLAN__DESIGN, null, msgs);
			msgs = basicSetDesign(newDesign, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanningPackage.DUAL_FACTOR_PLAN__DESIGN, newDesign, newDesign));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlanningPackage.DUAL_FACTOR_PLAN__FACTOR:
				return ((InternalEList<?>)getFactor()).basicRemove(otherEnd, msgs);
			case PlanningPackage.DUAL_FACTOR_PLAN__DESIGN:
				return basicSetDesign(null, msgs);
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
			case PlanningPackage.DUAL_FACTOR_PLAN__FACTOR:
				return getFactor();
			case PlanningPackage.DUAL_FACTOR_PLAN__DESIGN:
				return getDesign();
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
			case PlanningPackage.DUAL_FACTOR_PLAN__FACTOR:
				getFactor().clear();
				getFactor().addAll((Collection<? extends Factor>)newValue);
				return;
			case PlanningPackage.DUAL_FACTOR_PLAN__DESIGN:
				setDesign((TwoFactorDesign)newValue);
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
			case PlanningPackage.DUAL_FACTOR_PLAN__FACTOR:
				getFactor().clear();
				return;
			case PlanningPackage.DUAL_FACTOR_PLAN__DESIGN:
				setDesign((TwoFactorDesign)null);
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
			case PlanningPackage.DUAL_FACTOR_PLAN__FACTOR:
				return factor != null && !factor.isEmpty();
			case PlanningPackage.DUAL_FACTOR_PLAN__DESIGN:
				return design != null;
		}
		return super.eIsSet(featureID);
	}

} //DualFactorPlanImpl
